/*

DO WHILE LOOPS

- Do While Loop adalah perulangan yang hampir sama dengan While Loop
  Yang membedakan adalah, pada Do While Loop, kode blok akan dijalankan dahulu, baru diakhir
  dilakukan pengecekan kondisi

- Kalo kondisinya bernilai salah itu minimal sekali ditampilkan
  var i = 100

 */

fun main() {
    var i = 0

    do{
        println("Perulangan $i")
        i++
    }while (i < 10)

}