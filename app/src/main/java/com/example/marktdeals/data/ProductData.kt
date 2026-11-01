package com.example.marktdeals

val products = listOf(

    Product(
        name = "Gouda Kaas",
        price = "€4,75",
        category = "Meest Populaire Producten",
        icon = "🧀",
        description = "Milde Nederlandse Gouda kaas met een volle, romige smaak.",
        weight = "500 gram",
        usage = "Lekker op brood, crackers of als onderdeel van een borrelplank.",
        storePrices = listOf(
            StorePrice("Jumbo", "€4,75", "Normale prijs"),
            StorePrice("Albert Heijn", "€4,89", "Aanbieding geldig deze week"),
            StorePrice("PLUS", "€4,99", "Normale prijs")
        )
    ),

    Product(
        name = "Tomatensoep",
        price = "€2,99",
        category = "Meest Populaire Producten",
        icon = "🥫",
        description = "Jonge kaas met een zachte en romige smaak.",
        weight = "300 gram",
        usage = "Lekker op brood of als snack.",
        storePrices = listOf(
            StorePrice("Jumbo", "€2,99", "Normale prijs"),
            StorePrice("PLUS", "€3,09", "Aanbieding geldig deze week")
        )
    ),

    Product(
        name = "Aardbeien",
        price = "€1,59",
        category = "Meest Populaire Producten",
        icon = "🍓",
        description = "Verse aardbeien met een zoete en frisse smaak.",
        weight = "500 gram",
        usage = "Wassen voor gebruik. Lekker als snack, bij ontbijt of dessert.",
        storePrices = listOf(
            StorePrice("Albert Heijn", "€1,59", "Aanbieding geldig deze week"),
            StorePrice("PLUS", "€1,79", "Normale prijs")
        )
    ),

    Product(
        name = "Chocomel",
        price = "€1,45",
        category = "Beste Deals",
        icon = "🧃",
        description = "Romige chocolade voor een lekkere zoete traktatie.",
        weight = "200 gram",
        usage = "Direct te gebruiken.",
        storePrices = listOf(
            StorePrice("Dirk", "€1,45", "Aanbieding geldig deze week"),
            StorePrice("Jumbo", "€1,59", "Normale prijs")
        )
    ),

    Product(
        name = "Zeep",
        price = "€1,59",
        category = "Beste Deals",
        icon = "🧴",
        description = "Romige boter voor op brood en om mee te bakken.",
        weight = "250 gram",
        usage = "Koel bewaren. Geschikt voor bakken en smeren.",
        storePrices = listOf(
            StorePrice("PLUS", "€1,59", "Aanbieding geldig deze week"),
            StorePrice("Jumbo", "€1,69", "Normale prijs")
        )
    ),

    Product(
        name = "Kool",
        price = "€2,99",
        category = "Beste Deals",
        icon = "🥬",
        description = "Luchtige rijst die geschikt is voor verschillende maaltijden.",
        weight = "1 kilogram",
        usage = "Bereiden volgens de aanwijzingen op de verpakking.",
        storePrices = listOf(
            StorePrice("Albert Heijn", "€2,99", "Normale prijs")
        )
    ),

    Product(
        name = "Appelsap",
        price = "€2,29",
        category = "Nieuwe Deals",
        icon = "🧃",
        description = "Romige pindakaas met een rijke pindasmaak.",
        weight = "350 gram",
        usage = "Lekker op brood, crackers of in smoothies.",
        storePrices = listOf(
            StorePrice("Jumbo", "€2,29", "Aanbieding geldig deze week"),
            StorePrice("PLUS", "€2,49", "Normale prijs")
        )
    ),

    Product(
        name = "Kiwi Los",
        price = "€1,72",
        category = "Nieuwe Deals",
        icon = "🥝",
        description = "Verse kiwi met een frisse en lichtzure smaak.",
        weight = "Per stuk",
        usage = "Schillen voor gebruik.",
        storePrices = listOf(
            StorePrice("Lidl", "€1,72", "Normale prijs"),
            StorePrice("PLUS", "€1,89", "Aanbieding geldig deze week")
        )
    ),

    Product(
        name = "Hotdog",
        price = "€2,90",
        category = "Nieuwe Deals",
        icon = "🌭",
        description = "Sappige hotdog voor een snelle en makkelijke maaltijd.",
        weight = "4 stuks",
        usage = "Verwarm volgens de aanwijzingen op de verpakking.",
        storePrices = listOf(
            StorePrice("PLUS", "€2,90", "Aanbieding geldig deze week")
        )
    ),

    Product(
        name = "Croissant",
        price = "€0,42",
        category = "Nieuwe Deals",
        icon = "🥐",
        description = "Krokante voorgebakken croissant.",
        weight = "70 gram en 5 stuks",
        usage = "Bereiden volgens de aanwijzingen op de verpakking.",
        storePrices = listOf(
            StorePrice("Jumbo", "€0,42", "Aanbieding geldig deze week"),
            StorePrice("Albert Heijn", "€0,49", "Normale prijs"),
            StorePrice("PLUS", "€0,52", "Aanbieding geldig deze week"),
            StorePrice("AH", "€0,55", "Normale prijs")
        )
    ),

    Product(
        name = "Ham-Kaas Croissant",
        price = "€0,60",
        category = "Beste Deals",
        icon = "🥐",
        description = "Hartige broodjes met een kruidige vulling.",
        weight = "Per stuk",
        usage = "Bereiden volgens de aanwijzingen op de verpakking.",
        storePrices = listOf(
            StorePrice("Jumbo", "€0,60", "Normale prijs"),
            StorePrice("PLUS", "€0,65", "Aanbieding geldig deze week")
        )
    ),

    Product(
        name = "Mire Sauciapenbroodje",
        price = "€0,28",
        category = "Brood",
        icon = "🥐",
        description = "Een hartig saucijzenbroodje voor een snelle snack.",
        weight = "Per stuk",
        usage = "Bereiden volgens de aanwijzingen op de verpakking.",
        storePrices = listOf(
            StorePrice("PLUS", "€0,28", "Aanbieding geldig deze week")
        )
    ),

    Product(
        name = "Diepvries Saucijzenbroodje",
        price = "€0,82",
        category = "Brood",
        icon = "🥐",
        description = "Diepvries saucijzenbroodje met een hartige vulling.",
        weight = "Per stuk",
        usage = "Bereiden volgens de aanwijzingen op de verpakking.",
        storePrices = listOf(
            StorePrice("Jumbo", "€0,82", "Normale prijs")
        )
    ),

    Product(
        name = "Vega Saucijzenbroodjes",
        price = "€0,79",
        category = "Brood",
        icon = "🥐",
        description = "Vegetarisch saucijzenbroodje met een hartige vulling.",
        weight = "Per stuk",
        usage = "Bereiden volgens de aanwijzingen op de verpakking.",
        storePrices = listOf(
            StorePrice("Albert Heijn", "€0,79", "Aanbieding geldig deze week"),
            StorePrice("PLUS", "€0,89", "Normale prijs")
        )
    )
)