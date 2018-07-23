package eggwhite.theminimalplayer.adapters

import android.content.Context
import android.provider.MediaStore
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class MusicArtAdapter(val context : Context,
                      val musicList : List<MediaStore.Audio.Media>) : RecyclerView.Adapter<MusicArtAdapter.MusicArtViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicArtViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return musicList.size
    }

    override fun onBindViewHolder(holder: MusicArtViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    class MusicArtViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        lateinit var albumArt : ImageView
    }
}