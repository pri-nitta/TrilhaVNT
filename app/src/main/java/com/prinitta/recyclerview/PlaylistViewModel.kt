package com.prinitta.recyclerview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

internal class PlaylistViewModel: ViewModel() {
private val _playlistInfo: MutableLiveData<Music> = MutableLiveData()
    val playlistInfo: LiveData<Music>
        get() {
            TODO()
        }
}