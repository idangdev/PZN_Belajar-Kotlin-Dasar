/*

PACKAGE (spt Folder)

- Package adalah tempat yang bisa digunakan untuk mengorganisir kode program yang kita buat di Kotlin
- Dengan menggunakan package, kita bisa merapikan kode program Kotlin yang kita buat
- Penamaan package di Kotlin biasanya menggunakan huruf kecil semua
- Jika ingin membuat sub package bisa menggunakan tanda . (titik)


KODE: Package

package eko.util

fun sayHello(name: String){
    println("Hello $name")
}

fun sayHello(firstName: String, lastName: String){
    println("Hello $firstName $lastName")
}

=====================================================
CARA MENAMBAHKAN
-> Klik kanan pada src
-> Kemudian klik new
-> Kemudian klik package
        -> Biasanya kalo misal ada domain perusahaan bernama wildan.com maka dibalik
        -> com.wildan   karena ini mengikuti style java
                -> com.company.namaproject.specialpackage
                    -> com.company.belajar.util
                    -> com.company.belajar.database
        -> Kemudian kita coba bikin file di util
                    -> Namakan StringUtil.kt
                        Maka akan secara otomatis ada koe package com.company.belajar.util
                    -> Tambahkan kode
                        fun sayHello(name: String){
                            println("Hello $name")
                        }

                        fun sayGoodBye(name: String){
                            println("Goodbye $name")
                        }
==================================================
CATATAN
- Sebenernya kalo kita lihat file file yang ada di src itu
- Sebenernya ada packagenya. cuman disitu package default, makannya tidak dituliskan
  package com.blablabla
- Dan tidak bisa pakai function yang ada di file StringUtil, karena tidak berada didalam package yang sama


GIMANA KALO KITA MAU PAKAI FILE FILE YANG ADA DALAM PACKAGE LAIN?

PAKAI IMPORT
- Secara standar, file Kotlin hanya bisa mengakses file Kotlin lainnya yang berada dalam package yang sama
- Jika kita ingin mengakses file Kotlin yang berada diluar package, maka kita bisa menggunakan Import
- Saat melakukan import, kita bisa memilih ingin meng-import bagian tertentu, atau semua file


KODE: IMPORT

    import eko.util.sayHello

    fun main(){
        sayHello("Eko")

        // atau mau tanpa import
        eko.util.sayHello("Eko")
    }
 */

// Satu satu
// import com.company.belajar.util.sayHello

// kalo mau bisa mengakses semua isi file yang ada di StringUtil (import semuanya)
import com.company.belajar.util.*

fun main(){
    sayHello("Eko")
    sayGoodBye("Wildan")
    // langsung ketikkan seluruh nama package
    // com.company.belajar.util.sayGoodBye("Wildan")
}