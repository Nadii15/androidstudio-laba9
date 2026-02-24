package com.ryckluk.androidstudio_laba9.data

import com.ryckluk.androidstudio_laba9.model.Game
import com.ryckluk.androidstudio_laba9.R

class Datasource {
    fun loadGameList(): List<Game>{
        return listOf(
            Game(R.string.game1,
                R.string.desc1,
                R.drawable.game1),

            Game(R.string.game2,
                R.string.desc2,
                R.drawable.game2),

            Game(R.string.game3,
                R.string.desc3,
                R.drawable.game3),

            Game(R.string.game4,
                R.string.desc4,
                R.drawable.game4),

            Game(R.string.game5,
                R.string.desc5,
                R.drawable.game5),

            Game(R.string.game6,
                R.string.desc6,
                R.drawable.game6),

            Game(R.string.game7,
                R.string.desc7,
                R.drawable.game7),

            Game(R.string.game8,
                R.string.desc8,
                R.drawable.game8),

            Game(R.string.game9,
                R.string.desc9,
                R.drawable.game9),

            Game(R.string.game10,
                R.string.desc10,
                R.drawable.game10),

            )
    }
}