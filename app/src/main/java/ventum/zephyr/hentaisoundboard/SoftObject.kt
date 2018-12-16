package ventum.zephyr.hentaisoundboard

import ventum.zephyr.hentaisoundboard.HentaiActivity.Companion.drawables
import ventum.zephyr.hentaisoundboard.HentaiActivity.Companion.getRandomFrom
import ventum.zephyr.soundboardtemplate.model.SoundItem
import ventum.zephyr.soundboardtemplate.model.SoundItems

object SoftObject {

    fun createSoft() = SoundItems().apply {
        add(SoundItem(getRandomFrom(drawables), R.raw.moan1))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan10))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan11))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan12))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan13))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan14))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan15))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan16))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan17))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan18))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan19))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan2))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan20))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan21))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan3))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan4))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan5))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan6))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan7))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan8))
        add(SoundItem(getRandomFrom(drawables), R.raw.moan9))
    }
}