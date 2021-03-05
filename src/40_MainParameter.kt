/*
MAIN PARAMETER

- Kadang saat menjalankan program, kita butuh input parameter dari luar
- Bisa untuk konfigurasi program, ataupun yang lainnya
- Kotlin mendukung parameter untuk main function


CATATAN

- Kita sudah belajar main function, dimana main function akan dieksekusi ketika program kotlin itu berjalan
- Kalo di Kotlin itu ada yang namanya Main Parameters. tapi kalo di Java itu namanya Main Argument
- Tapi kalo di Kotlin itu sebenernya opsional

KODE: MAIN PARAMETERS

    fun main(args: Array<String>){
        for(value in args){
            println(value)
        }
    }

CATATAN
- Ketikkan main kemudian CTRL + SPASI
- Pilih yang maina

 */

fun main(args: Array<String>) {
    for (value in args){
        println(value)
    }

    // Kalo kita langsung jalankan maka tidak muncul apa2
    // klik sebelah kiri nya tombol run (nama file)
    // pilih Edit Configurations
    // pilih main parameter
    // klik program argumen dan isi " wildan sania alfiansyah "

    // OUTPUT
    /*wildan
    sania
    alfiansyah*/

    // KALO TEMEN2 BUTUHNYA PAKAI SPASI
    // Maka ketika mengisi program argumen itu
        // "eko kurniawan khannedy" "Wildan sania alfiansyah"



    // Ini mirip kaya temen2 ngejalanin program di terminal atau cmd
    // misal kita manggil java
    // buka terminal, ketikkan java -version

    // -version ini dianggap sebagai argumen (args: Array<String>)
}