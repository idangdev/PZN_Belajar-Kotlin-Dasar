/*

INLINE FUNCTIONS

- Menggunakan Higher - Order Function adalah salah satu fitur yang sangat berguna
- Namun penggunaan Higher-Order Function akan berdampak terhadap performa saat aplikasi
  Berjalan karena harus membuat object lambda berulang-ulang. Jika penggunannya tidak terlalu
  banyak mungkin tidak akan terasa, tapi jika banyak sekali maka akan terasa impact nya
- Inline Functions adalah kemampuan di Kotlin yang mengubah Higher-Order Function menjadi
  Inline Function
- Dimana dengan Inlince Function, code di dalam Higher-Order Function akan di duplicate agar pada
  saat runtime, aplikasi tidak perlu membuat object lambda berulang-ulang.


PENJELASAN
- Sebelumnya kita sudah belajar tentang Higher-Order Function. Fitur itu sangat berguna
  dan juga sangat menarik. dan fitur itu juga sangat populer. jika kita mau mengimplementasikan
  functional programming di kotlin.
- Namun pada kenyataannya, Kotlin itu kan ketika dikompile akan menjadi java binary code
- Problemnya adalah di Java itu gk ada yang namanya Functional Programming, karena ujung2nya selalu
  menjadi object
- Jadi penggunaan Higher-Order Functions itu akan berdampak terhadap performa saaat aplikasi berjalan
- Karena saat kita bikin Higher-order function, sebenarnya di javanya dia menjadi object java
- Jika kita memanggil lambda terus menerus. atau kita bikin looping di dalam loopingnya kita manggil lambda
  terus terusan. maka setiap perulangannya itu kita akan membuat objek baru terus menerus.
- Biasanya performanya akan ngedrop menjadi semakin lambat.
- Jika kita manggilnya sedikit. maka tidak akan terasa. tp kalo kita looping 1000 kali maka akan terasa
- Dikotlin ada kemampuan mengubah HIGHER-ORDER FUNCTIONS menjadi INLINE FUNCTIONS
- INLINE FUNCTION adalah kemampuan dimana dengan inline function kode didalam higher order functions
  akan di duplicate. agar pada saat runtime aplikasi tidak perlu membuat object berulang2
- Jika kita memanggil Higher order function nya 2x maka si lambda nya akan menduplikat 2x jd seakan2
  tidak ada lagi lambda. seakan2 tidak ada lambda, tp disaat kita ngoding maka tetap pake lambda
- Inline function ketika kita bikin kode kotlinnya dia menggunakan lambda expression tapi ketika di compile
  dia akan menjadi FUNCTION biasa
  
 
==============================================================
inline fun hello(): (name: () -> String): String {
    return "Hello ${name()}"
}

fun main(){
    println(hello {"Eko"})
    println(hello {"Kurniawan"})
}

 */


// APA BEDANYA FUN HIGH ORDER BIASA DENGAN INLINE?

// 1. Pergi ke Tools
// 2. Kotlin
// 3. Show Kotlin Bytecode
// 4. Kemudian Decompile, dan perhatikan perbedaanya

/*

- Di function helloFun.
  Dia akan bikin Function0. dia bakalan dibikin ulang terus setiap dipanggil
  semakin banyak function nya dipanggil maka dia akan dibikin objectnya terus

   public static final void main() {
->      String var0 = hello((Function0)null.INSTANCE);
      boolean var1 = false;
      System.out.println(var0);
->      var0 = hello((Function0)null.INSTANCE);
      var1 = false;
      System.out.println(var0);
   }

=============================================
- Tapi kalo inline functin hello tidak pernah dipanggil.
- Karena kode dibawah ini akan diduplikat
   public static final String hello(@NotNull Function0 name) {
->      int $i$f$hello = 0;
->      Intrinsics.checkNotNullParameter(name, "name");
->      return "Hello " + (String)name.invoke();
   }

- Diduplikat kesini

   public static final void main() {
->      int $i$f$hello = false;
->      StringBuilder var2 = (new StringBuilder()).append("Hello ");
->      int var1 = false;
->      String var3 = "Eko";
->      String var4 = var2.append(var3).toString();
->      var1 = false;
->      System.out.println(var4);
      $i$f$hello = false;
      var2 = (new StringBuilder()).append("Hello ");
      var1 = false;
      var3 = "Kurniawan";
      var4 = var2.append(var3).toString();
      var1 = false;
      System.out.println(var4);
   }

===================================================

- Kalo saya ngelakuin pengulangan di sini

    // bukan inline
    fun hello(name: () -> String): String {
        return "Hello ${name()}"
    }

    fun main(){
        for(i in 0..100){
            println(hello{"Eko"})
        }
    }
- Kemudian kita decompile lagi
- Maka dia akan membuat funtion0 object sebanyak 100x

    public static final void main() {
          int var0 = 0;    |
                           v
          for(byte var1 = 100; var0 <= var1; ++var0) {
->             String var2 = hello((Function0)null.INSTANCE);
             boolean var3 = false;
             System.out.println(var2);
          }

       }
    }


 ==========================================

 - Tapi kalo kit pakai inline
 - Logic function hellonya itu diduplikat ke perulangan fornya

    public static final String hello(@NotNull Function0 name) {
->      int $i$f$hello = 0;
->      Intrinsics.checkNotNullParameter(name, "name");
->      return "Hello " + (String)name.invoke();
   }

   ===================================================
      public static final void main() {
      int var0 = 0;

      for(byte var1 = 100; var0 <= var1; ++var0) {
->         int $i$f$hello = false;
->         StringBuilder var4 = (new StringBuilder()).append("Hello ");
->         int var3 = false;
->         String var5 = "Eko";
->         String var6 = var4.append(var5).toString();
->         var3 = false;
->         System.out.println(var6);
      }

   }


- Jadi disini saya tidak perlu membuat objek baru Function0
- Dan saya tidak perlu manggil function hello nya
- Ini merupakan performance improvement dari si Koltin

- Walaupun kodenya lebih banyak. tapi performance nya lebih kenceng
  Karena memang kita tidak perlu membuat objek. cukup di duplikat aja

 =======================================================

 KAPAN KITA MEMERLUKAN INLINE?
- Kalo bisa sih kalo emang beneran butuh aja
- karena kalo semuanya dijadikan inline nanti source code / byte codenya
  akan terlalu besar karena kodenya semuanya diduplikat
- tapi kalo misalnya temen2 "oh ini bakalan looping 100x"
  nah itu baru kita bisa bikin. sehingga optimal


=================================================

NOINLINE
- Saat menandai bahwa function adalah inline, maka secara otomatis semua
  parameter akan menjadi inline
- Jika kita ingin memberi tahu bahwa jangan melakukan inline terhadap parameter,
  kita bisa menandai parameter tersebut dengan kata kunci no inline
- Jadi misal temen2 punya 2 paramter. nah temen2 maunya 1 parameter inline
  dan satunya lg tidak mau inline, tetep mau dijadikan object. maka pake noinline


========================================================
KODE : NOINLINE

    inline fun hello(firstName: () -> String,
                        noinline lastName: () -> String): String{
        return "Hello ${firstName()} ${lastName()}"
    }

    fun main(){
        println(hello({ "Eko" }, { "Khannedy" }))
    }
 */

            // lambda
fun hello(name: () -> String): String{
                  //lambda
    return "Hello ${name()}"
}

fun main() {

    for (i in 0..100) {
        println(hello { "Eko" })
    }
}
