package ventum.zephyr.hentaisoundboard

import ventum.zephyr.hentaisoundboard.HentaiActivity.Companion.drawables
import ventum.zephyr.hentaisoundboard.HentaiActivity.Companion.getRandomFrom
import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems

object PettingObject {

    fun createPetting() = SoundItems().apply {
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample1))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample10))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample11))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample12))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample13))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample15))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample17))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample18))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample19))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample2))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample20))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample24))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample3))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample4))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample6))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample7))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample8))
        add(SoundItem(getRandomFrom(drawables), R.raw.animesample9))
    }
}