package com.example.kabupaten;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Propinsi {
    private String name;
    private Kabupaten[] kabupatens;

    public static Kabupaten[] jabar = {
            new Kabupaten("Kabupaten Garut", "Nama Bupati : Aceng Fikri\n Luas : 3.065 km²"),
            new Kabupaten("Kota Bandung", "Nama Walikota : Ridwan Kamil\n Luas : 167,3 km²"),
            new Kabupaten("Kota Tasikmalaya", "Nama Walikota : Muhammad Yusuf\n Luas : 4.260 km²")
    };
    public static Kabupaten[] jateng = {
            new Kabupaten("Kabupaten Tegal", "Nama Bupati : Ki Enthus Susmono\n Luas : 878,8 km²"),
            new Kabupaten("Kabupaten Banjarnegara", "Nama Bupati : Budhi Sarwono\n Luas : 1.070 km²"),
            new Kabupaten("Kabupaten Cilacap", "Nama Bupati : Tato Suwarto Pamuji\n Luas : 2.142 km²")
    };
    public static Kabupaten[] jatim = {
            new Kabupaten("Kabupaten Sumenep", "Nama Bupati : Achmad Fauzi\n Luas : 2.093 km²"),
            new Kabupaten("Kabupaten Bangkalan", "Nama Bupati : Abd Latif Imron Amin\n Luas : 1.260 km²"),
            new Kabupaten("Kabupaten Banyuwangi", "Nama Bupati : Ipuk Fiestiandani\n Luas : 5.782 km²")
    };
    public static Propinsi[] propinsis = {
            new Propinsi("Jawa Barat", jabar),
            new Propinsi("Jawa Tengah", jateng),
            new Propinsi("Jawa Timur", jatim)
    };
}
