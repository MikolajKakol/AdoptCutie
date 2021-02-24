package com.mikolajkakol.adoptpuppy

class Cutie(
    val imageRes: Int,
    val name: String,
) {
    val description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In libero dui, gravida ac ultricies ut, scelerisque a diam. Ut maximus laoreet magna sed tempor. Mauris ligula est, dignissim ut tempor congue, sodales eget dolor. Suspendisse tincidunt cursus risus et bibendum. Sed ultricies felis in finibus ultricies. Curabitur eget nibh nunc. Curabitur nec mattis diam. Integer eget nisi non erat rutrum ullamcorper sit amet sit amet erat. Morbi at erat eu massa maximus sollicitudin quis a neque. Duis nulla mauris, luctus ac luctus quis, rutrum vitae est.\n" +
            "\n" +
            "Aenean ullamcorper lacus nec interdum gravida. Suspendisse nec leo quam. Curabitur molestie non lectus ut malesuada. Donec convallis ipsum vitae ipsum venenatis euismod. Cras et efficitur leo, ac vehicula mauris. Integer feugiat lectus vel leo imperdiet, id laoreet lacus eleifend. Nulla pharetra velit non ante elementum, eu tempus mauris dignissim. Integer vel dui vehicula, facilisis nisl sed, volutpat elit. Etiam maximus massa sit amet ligula sollicitudin semper. Aliquam varius fringilla rutrum. Vivamus eleifend, risus sed laoreet ultricies, mauris turpis finibus massa, non efficitur dolor libero ac diam. Suspendisse luctus, eros at hendrerit feugiat, nulla justo laoreet felis, at porta enim eros id arcu. Morbi massa ante, sollicitudin sed varius condimentum, venenatis eget metus. Nam tristique leo vitae enim suscipit viverra.\n" +
            "\n" +
            "Duis ut auctor mi, et condimentum lorem. Sed ut est felis. Aliquam diam leo, egestas at hendrerit nec, blandit a libero. Aliquam nunc elit, ultrices maximus iaculis nec, tempus in sapien. Maecenas ac ornare ante, non euismod leo. Sed sit amet sollicitudin diam. Sed auctor fermentum dolor, quis lobortis urna varius ac.\n" +
            "\n" +
            "Aenean finibus diam eget finibus bibendum. Cras dapibus nunc eu tortor eleifend, id elementum lorem cursus. Sed sit amet varius arcu. Phasellus posuere volutpat lectus, sed commodo massa rhoncus ut. Praesent vitae sem id diam interdum scelerisque. Phasellus lacus lacus, commodo sed porttitor quis, bibendum sit amet sem. Vivamus nunc turpis, volutpat quis orci vestibulum, placerat semper lacus. Ut pellentesque rhoncus varius.\n" +
            "\n" +
            "Sed dolor sem, hendrerit sit amet varius sed, egestas eleifend neque. Nullam lobortis felis et sollicitudin ultricies. Donec vel viverra massa, non consequat sem. Etiam rhoncus convallis ornare. Quisque semper enim eget suscipit sagittis. Sed eu egestas leo. Phasellus posuere sem at lacus luctus porta porta ac ipsum. Donec quam sem, consectetur ut magna molestie, elementum maximus neque. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Curabitur congue egestas odio, at consectetur arcu tincidunt ac. Sed a lorem risus. Nullam volutpat justo nec odio facilisis rutrum. Aliquam id justo feugiat, maximus odio euismod, interdum augue. Phasellus vitae diam ut tellus ultricies vehicula. "

    companion object {

        val cuties = listOf(
            Cutie(R.drawable.puppy1, "Sherlock"),
            Cutie(R.drawable.puppy2, "Django"),
            Cutie(R.drawable.puppy3, "Gary"),
            Cutie(R.drawable.puppy4, "Holmes"),
            Cutie(R.drawable.puppy5,"Chelsea"),
            Cutie(R.drawable.puppy6, "Bobcat"),
            Cutie(R.drawable.puppy7, "Daisy"),
            Cutie(R.drawable.puppy8, "Zorro"),
        )
    }
}