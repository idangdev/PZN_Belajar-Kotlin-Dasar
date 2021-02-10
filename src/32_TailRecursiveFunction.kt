/*

TAIL RECURSIVE FUNCTION

- Recursive function adalah salah satu kemampuan bagus di Kotlin,
  namun sayangnya ada keterbatasan dalam penggunaan recursive
- Jika recursive function yang kita buat, saat dijalankan memanggil
  function dirinya sendiri terlalu dalam, maka bisa dimungkinkan akan terjadi error stack overflow


CATATAN
- Misal kalo kita memanggil recursive function terus menerus misal ribuan kali. maka kemungkinkan terkena error
  Stack Over Flow
- Karena sebenernya Recursive Function itu ketika kita menjalankannya. Sebenernya itu dia terus manggil
  Function selanjutnya, manggil Function selanjutnya, manggil Function selanjutnya. Itu harus nunggu sampai
  ujung function nya itu selesai. Kalo ujung function nya itu belum selesai maka function yang pertama
  tidak akan berhenti
- Misal saja kita manggil 1.000.000 kali. maka function yang pertama akan terus menunggu sampai 1 juta function
- Setelah sampai 1 juta function. maka akan naik lagi. 1 function sebelumnya 1 function sebelumnya
- Jadi bukan seperti looping biasa. melainkan semacam TUMPUKAN.
- Kalo TUMPUKANNYA terlalu besar. maka akan terjadi error Stack Over Flow


MISAL

fun factorialRecursive(value: Int): Int{
    return when(value){
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}

println(factorialRecursive(1000000))

----- Stack Overflooowww ----

1_000_000 * 999_999 * 999_998 dst

=======================================================

STACK OVER FLOW

factorial(5)
factorial(5) => 5 * factorial(4)
factorial(5) => 5 * factorial(4) => 4 * factorial(3)
factorial(5) => 5 * factorial(4) => 4 * factorial(3) => 3 * factorial(2)
factorial(5) => 5 * factorial(4) => 4 * factorial(3) => 3 * factorial(2) => 2 * factorial(1)
factorial(5) => 5 * factorial(4) => 4 * factorial(3) => 3 * factorial(2) => 2 * factorial(1) => 1

=======================================================

TAIL RECURSIVE FUNCTION

- Permasalahan ini di bahasa pemrograman Java tidak bisa ditangani
- Namun di Kotlin, masalah ini ada solusinya, yaitu dengan menggunakan tail recursive function
- Tail recursive function adalah teknik mengubah recursive function yang kita buat,
  menjadi looping biasa ketika dijalankan
- Tidak semua recursive function bisa secara otomatis dibuat menjadi tail recursive
  function, ada syarat-syarat nya

SYARAT

- Tambahkan tailrec di functionnya
- Saat memanggil function dirinya sendiri, hanya boleh memanggil function
  dirinya sendiri, tanpa embel-embel operasi dengan data lain
        - Contohnya, untuk operasi factorialRecursive yang sudah kita buat sebelumnya
          Sebenernya tidak bisa dibikin TAIL RECURSIVE karena ada embel - embel operasi
                - else -> value * factorialRecursive(value - 1)


 */