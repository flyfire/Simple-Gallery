package com.simplemobiletools.gallery.extensions

import android.os.Environment
import com.simplemobiletools.commons.models.FileDirItem

fun FileDirItem.isDownloadsFolder() = path == Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString()
