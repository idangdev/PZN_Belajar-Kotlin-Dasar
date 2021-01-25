/*

TIPE DATA STRING

- Tipe data string adalah tipe data yang berisikan data kumpulan karakter atau sederhananya adalah teks.
- Di kotlin, tipe data string direpresentasikan dengan kata kunci String.
- Untuk membuat string di kotlin, kita bisa menggunakan
    - “ (tanda petik 2) untuk teks satu baris
    - “”” (tanda petik 2 sebanyak 3 kali) untuk teks lebih dari satu baris


 */

fun main() {

    var firstName: String = "Eko"
    var lastName: String = "Khannedy"
    var fullName: String = "Eko Kurniawan Khannedy"
    var address: String = """
        Street Not Yet Done,
        Province Subang,
        Country Indonesia
    """

    var address1: String = """
        |Street Not Yet Done,
        |Province Subang,
        |Country Indonesia
    """.trimMargin()
    var address2: String = """
        >Street Not Yet Done,
        >Province Subang,
        >Country Indonesia
    """.trimMargin(">")

    //atau yang lebih baru

    var address3: String = """
        Street Not Yet Done,
        Province Subang,
        Country Indonesia
    """.trimIndent()

    // Menggabungkan String

    var firstName2: String = "Eko"
    var lastName2: String = "Khannedy"
    var fullName2: String = firstName2 + " " + lastName2

    // Untuk menggabungkan String, bisa dengan cara diatas
    // Tetapi yang direkomendasikan adalah menggunakan
    // String template

    var fullName3: String = "$firstName2 $lastName2"
    var desc: String = "Total $fullName3 char = ${fullName3.length}"

}