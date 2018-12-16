package ventum.zephyr.hentaisoundboard

import ventum.zephyr.hentaisoundboard.HentaiActivity.Companion.drawables
import ventum.zephyr.hentaisoundboard.HentaiActivity.Companion.getRandomFrom
import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems

object HentaiObject {

    fun createHentai() = SoundItems().apply {
        add(SoundItem(getRandomFrom(drawables), R.raw.hitsound_menu_note1))
        add(SoundItem(getRandomFrom(drawables), R.raw.hitsound_menu_note2))
        add(SoundItem(getRandomFrom(drawables), R.raw.hitsound_menu_note3))
        add(SoundItem(getRandomFrom(drawables), R.raw.hitsound_menu_note4))
        add(SoundItem(getRandomFrom(drawables), R.raw.hitsound_menu_note5))
        add(SoundItem(getRandomFrom(drawables), R.raw.hitsound_menu_note6))
        add(SoundItem(getRandomFrom(drawables), R.raw.hitsound_menu_note7))
        add(SoundItem(getRandomFrom(drawables), R.raw.hitsound_menu_note7b))
        add(SoundItem(getRandomFrom(drawables), R.raw.hitsound_menu_note8))
        add(SoundItem(getRandomFrom(drawables), R.raw.hitsound_menu_note9))
        add(SoundItem(getRandomFrom(drawables), R.raw.kill2))
        add(SoundItem(getRandomFrom(drawables), R.raw.kill3))
        add(SoundItem(getRandomFrom(drawables), R.raw.kill4))
        add(SoundItem(getRandomFrom(drawables), R.raw.kill5))
        add(SoundItem(getRandomFrom(drawables), R.raw.kill6))
        add(SoundItem(getRandomFrom(drawables), R.raw.kill7))
        add(SoundItem(getRandomFrom(drawables), R.raw.kill8))
        add(SoundItem(getRandomFrom(drawables), R.raw.kill9))
        add(SoundItem(getRandomFrom(drawables), R.raw.killsound_note))
    }
}