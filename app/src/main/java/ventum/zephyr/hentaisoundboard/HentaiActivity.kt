package ventum.zephyr.hentaisoundboard

import ventum.zephyr.hentaisoundboard.HentaiObject.createHentai
import ventum.zephyr.hentaisoundboard.OrgasmObject.createOrgasm
import ventum.zephyr.hentaisoundboard.PettingObject.createPetting
import ventum.zephyr.hentaisoundboard.SoftObject.createSoft
import ventum.zephyr.soundboardtemplate.model.SoundItems
import ventum.zephyr.soundboardtemplate.model.SoundboardCategory
import ventum.zephyr.soundboardtemplate.ui.SoundboardActivity
import java.util.*

class HentaiActivity : SoundboardActivity() {

    companion object {

        val drawables = intArrayOf(
            R.drawable.anime1, R.drawable.anime2, R.drawable.anime3, R.drawable.anime4, R.drawable.anime5,
            R.drawable.anime6, R.drawable.anime7, R.drawable.anime8, R.drawable.anime9, R.drawable.anime10,
            R.drawable.anime11, R.drawable.anime12, R.drawable.anime13, R.drawable.anime14, R.drawable.anime15,
            R.drawable.anime16, R.drawable.anime17, R.drawable.anime18, R.drawable.anime19, R.drawable.anime20,
            R.drawable.anime21, R.drawable.anime22, R.drawable.anime23, R.drawable.anime24, R.drawable.anime25,
            R.drawable.anime26, R.drawable.anime27, R.drawable.anime28, R.drawable.anime29, R.drawable.anime30,
            R.drawable.anime31, R.drawable.anime32, R.drawable.anime33, R.drawable.anime34, R.drawable.anime35,
            R.drawable.anime36, R.drawable.anime37, R.drawable.anime38
        )

        fun getRandomFrom(array: IntArray) = array[Random().nextInt(array.size)]
    }

    override fun getSoundboardCategories() = ArrayList<SoundboardCategory>().apply {
        add(
            SoundboardCategory(
                getString(R.string.soft_category),
                SoundItems().apply { addAll(createSoft()) },
                getString(R.string.soft_banner)
            )
        )
        add(
            SoundboardCategory(
                getString(R.string.petting_category),
                SoundItems().apply { addAll(createPetting()) },
                getString(R.string.petting_banner)
            )
        )
        add(
            SoundboardCategory(
                getString(R.string.orgasm_category),
                SoundItems().apply { addAll(createOrgasm()) },
                getString(R.string.orgasm_banner)
            )
        )
        add(
            SoundboardCategory(
                getString(R.string.hentai_category),
                SoundItems().apply { addAll(createHentai()) },
                getString(R.string.hentai_banner)
            )
        )
    }

    override fun getBlurRadius(): Int = 0

    override fun getClickToAdsCount() = Random().nextInt(3) + 7
}
