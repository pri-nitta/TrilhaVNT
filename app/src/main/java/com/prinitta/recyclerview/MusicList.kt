package com.prinitta.recyclerview

class MusicList {

    fun loadItems(): List<Music> = listOf(
        Music(
            name = "You Oughta Know",
            singer = "Alanis Morissete",
            length = "4:09"
        ),
        Music(
            name = "Seu Astral",
            singer = "Jorge & Mateus",
            length = "4:04"
        ),
        Music(
            name = "Bebi Liguei",
            singer = "Marilia Mendonça",
            length = "2:40"
        ),
        Music(
            name = "Astronaut In The Ocean",
            singer = "Masked Wolf",
            length = "2:13"
        )
    )
}