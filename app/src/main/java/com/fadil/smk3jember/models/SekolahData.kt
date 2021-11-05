package com.fadil.smk3jember.models

import com.example.smk3jember.R

object SekolahData {

    private val itemname = arrayOf(
        "Profile SMK",
        "Visi & Misi",
        "Tujuan",
        "Kompetensi Keahlian",
        "Alamat Sekolah",
        "Kontak",

    )

    private val itemdesc = arrayOf(
        "SMKN 3 Jember merupakan Sekolah Menengah Kejuruan berbasis Pariwisata yang ada di Jember, Jawa Timur. \n\n"+
                "Pada awal berdirinya, sekolah ini bernama Sekolah Kesejahteraan Keluarga Tingkat Atas (SKKA) pada tahun 1969. Pada tahun pelajaran 1976 berganti nama menjadi SMKK. \n"+
                "tahun pelajaran 1997 berganti nama menjadi SMK Negeri 3 Jember hingga sekarang.\n",
        "Visi\n" +
                "\n" +
                "Menjadi lembaga pendidikan kejuruan yang dikelola secara professional, menghasilkan lulusan yang berIMTAQ, kompeten di bidangnya dan berwawasan budaya bangsa.\n" +
                "\n" +
                "Misi\n" +
                "\n" +
                "1. Menjadi lembaga pendidikan kejuruan yang dikelola secara professional menghasilkan lulusan yang berIMTAQ, kompeten di bidangnya dan berwawasan budaya bangsa\n" +
                "2. Membangun iklim belajar yang berIMTAQ dan berwawasan budaya bangsa.\n" +
                "3. Melaksanakan pengelolaan pendidikan menuju standar ISO 9001-2008.\n" +
                "4. Meningkatkan kualifikasi tenaga pendidik dan kependidikan.\n" +
                "5. Melaksanakan pembelajaran yang bermutu, berbasis TIK dan multilingual.\n" +
                "6. Membekali siswa dengan pengetahuan dan keterampilan agar menghasilkan tamatan yang kompeten di bidangnya.\n" +
                "7. Meningkatkan kerjasama dengan DU/DI dalam pembelajaran produktif dan penyaluran tamatan.\n" +
                "8. Meningkatkan fasilitas dan layanan pendidikan sesuai dengan standar nasional pendidikan.\n" +
                "9. Meningkatkan peran Business Centre dalam menunjang kegiatan sekolah.\n" ,
        "Tujuan :\n\n"+
                "1. Sekolah memiliki hubungan kemitraan yang baik dengan seluruh warga sekolah, stake holders dan instansi serta institusi pendukung pendidikan lainnya.\n"+
                "2. Siswa memiliki, mengaplikasikan dan meningkatkan nilai-nilai ketuhanan serta nilai-nilai kehidupan yang bersifat universal dalam kehidupannya.\n",
        "Kompetensi keahlian yang ada pada SMKN 3 Jember\n" +
                "\n" +
                "1. Akomodasi Perhotelan :\n"+
                "Perhotelan merupakan bidang ilmu yang mempelajari pengelolaan hotel serta cara menyeimbangkan aspek wisata dan manajemen bisnis untuk mencapai kesuksesan.\n" +
                "2. Usaha Perjalanan Wisata :\n" +
                "Program studi yang mempelajari kegiatan yang bersifat komersial yang memberi pelayanan bagi suatu kelompok yang melakukan perjalanan dengan tujuan utama yaitu berwisata.\n" +
                "3. Tata Boga :\n"+
                "Program studi yang mempelajari teknik penyajian makanan dengan memperhatikan kualitas, rasa, estetika, dan kebutuhan gizi. Kamu akan belajar mengolah berbagai hidangan dari daerah dan negara."+
                "4. Tata Busana :\n"+
                "Program studi yang mempelajari teknik penyajian makanan dengan memperhatikan kualitas, rasa, estetika, dan kebutuhan gizi. Kamu akan belajar mengolah berbagai hidangan dari daerah dan negara.\n"+
                "5. Teknik Komputer dan Jaringan :\n" +
                "Program studi yang mempelajari tentang cara-cara merakit komputer dan menginstalasi program komputer. Program studi ini juga membahas hal yang berkaitan dengan jaringan.\n",

        "Berikut merupakan alamat sekolah SMK Negeri 3 Jember\n"+
                "Jl. dr Soebandi No 31, Kreongan, Kaliwates, Kabupaten Jember, Jawa Timur 68131",
        "Berikut merupakan kontak yang dapat digunakan untuk menghubungi kami :\n\n " +
                "No Telepon : 0331 - 488069\n" +
                "Surel      : smk3_jember@yahoo.co.id\n" +
                "Instagram  : @smkn3_jember\n" +
                "Facebook   : SMKN 3 JEMBER \n"

    )
    private val itemimg = arrayOf(
        R.drawable.profile,
        R.drawable.visimisi,
        R.drawable.tujuan,
        R.drawable.kompetensi,
        R.drawable.alamat,
        R.drawable.kontak

    )

    val listMenu : ArrayList<Sekolah>
        get() {
            val list = arrayListOf<Sekolah>()
            for (position in itemname.indices){
                val sekolah = Sekolah()
                sekolah.name = itemname[position]
                sekolah.desc = itemdesc[position]
                sekolah.image = itemimg[position]
                list.add(sekolah)
            }
            return list
        }
}