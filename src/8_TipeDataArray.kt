/*

TIPE DATA ARRAY

- Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
- Tipe data array di Kotlin direpresentasikan dengan kata kunci Array


 */

fun main() {

    // ARRAY -> Tipe data harus sama
    val members: Array<String> = arrayOf("Eko", "Joko", "Budi")
    val values: Array<Byte> = arrayOf(100, 90, 95)
    val balances: Array<Int> = arrayOf(1_000, 20_000, 30_000)

    // =============================
    // INDEX DI ARRAY
        // Dimulai dari 0

    // =============================
    // OPERASI DI ARRAY
    // size, get(index), [index], set(index, value), [index] = value


    // =============================
    // KODE OPERASI ARRAY

    members.set(0, "Amar")
    val amar: String = members[0]


    // ==============================
    // ARRAY NULLABLE

    val names: Array<String?> = arrayOfNulls(5)
    names.set(0, "Eko")
    names.set(1, "null")
    names.set(2, "Kurniawan")
    names.set(3, "null")
    names.set(4, "Khannedy")
}