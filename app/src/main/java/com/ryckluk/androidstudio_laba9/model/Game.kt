package com.ryckluk.androidstudio_laba9.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Game(
    @StringRes val titleResourceId: Int,
    @StringRes val descriptionResourceId: Int,
    @DrawableRes val imageResourceId: Int
)