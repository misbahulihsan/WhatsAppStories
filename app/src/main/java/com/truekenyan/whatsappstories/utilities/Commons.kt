package com.truekenyan.whatsappstories.utilities

class Commons {
    companion object {
        const val PHOTOS = "photos"
        const val VIDEOS = "videos"
        const val SAVED = "saved"
        const val STORIES_PATH = "/WhatsApp/Media/.Statuses"
        const val SAVED_PATH = "/storage/emulated/0/WhatsAppStories/"
        const val VIEW = "view"
        const val SAVE = "save"
        const val PATH = "path"

        enum class Type {
            Image, Video, Gif
        }
    }
}