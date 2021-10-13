package com.example.rest20.Services

import com.example.rest20.Model.Dish

object FakeDB {

    val salads = listOf(

        Dish("Greek Salad", "by far the most famous salad in a Greek restaurant assembled to order, always using the freshest ingredients. Fresh cut tomatoes, chopped mini cucumbers, placed over a bed of finely chopped lettuce, cabbage and topped with sweet onions, Feta cheese pitted olives and oregano.", "$ 12", "greeksalad"),
        Dish("Tossed Spicy Feta Salad", "a mix of finely chopped lettuce, cabbage, sweet onions, sliced tomatoes tossed with our own spicy feta salad dressing prepared to order. An unforgettable flavor you will want to repeat.", "$ 11", "fetasalad"),
        Dish("Horiatiki Agourodomata", "Bite size chunks of tomatoes and cucumbers, topped with fresh cut white or red onion, pieces of feta cheese and sprinkled with oregano", "$ 13", "horiatikiagouromata")
    )

    val mainDishes = listOf(

        Dish( "Lamb Roast", "lamb deliciously marinated in oregano fresh squeezed lemon oven roasted and served with delicious lemon potatoes Greek style", "$ 20", "lanbroast"),
        Dish("Moussaka", "layered grilled eggplant, sliced potatoes, seasoned ground sirloin topped with a lightly prepared bchamel and oven cooked. A traditional Mediterranean dish given a European", "$ 15", "moussaka"),
        Dish("Pastitsio", "the Greek lasagna. Layered pastitsio pasta prepared with the one of a kind seasoned ground sirloin topped with a lightly prepared bchamel sauce and oven bake", "$ 18", "pastitsio")
    )

    val desserts = listOf(

        Dish("Mille Feuille (1000 layers)", "airy, flaky custard pastry most cannot get enough of", "$ 7", "desserts"),
        Dish("Ekmek Kadaifi", "shredded filo topped with home made custard yogurt cream and cinnamon", "$ 8", "ekmek"),
        Dish("Armenovil", "meringue, chocolate, and caramelized almond ice cream topped with chocolate sauce a Thessaloniki favorite", "$ 10", "armenonville")
    )
}