package com.example.recyclerview

data class Thing(val name: String, val info: String, val image: Int){
    companion object{
        val things = mutableListOf(
            Thing("Пальто", "Пальто черное", R.drawable.image_thing_1),
            Thing("Футболка", "Футболка Кострома", R.drawable.image_thing_2),
            Thing("Шарф", "Шарф белый", R.drawable.image_thing_3),
            Thing("Джинсы", "Джинсы голубые", R.drawable.image_thing_4),
            Thing("Шапка", "Шапка обычная, черная", R.drawable.image_thing_5),
            Thing("Шапка", "Шапка - ушанка, черная", R.drawable.image_thing_6),
            Thing("Платок", "Платок, зеленый", R.drawable.image_thing_7),
            Thing("Кот?", "Опять спрятался здесь", R.drawable.image_thing_8),
            Thing("Носки", "Носки цвета хакки", R.drawable.image_thing_9),
            Thing("Варежки", "Варежки бежевые", R.drawable.image_thing_10),
            Thing("Перчатки", "Перчатки черные", R.drawable.image_thing_11),
            Thing("Спортивный костюм", "Костюм китайский, синий", R.drawable.image_thing_12),
            Thing("Валенки", "Валенки серые", R.drawable.image_thing_13),
            Thing("Сапоги", "Сапоги резиновые, черные", R.drawable.image_thing_14),
            Thing("Тапки", "Тапки мягкие, синие", R.drawable.image_thing_15),
            Thing("Сумка", "Сумка дорожная", R.drawable.image_thing_16),
            Thing("Лыжи", "Лыжи синие", R.drawable.image_thing_17),
            Thing("КПБ", "Комплект постельного белья", R.drawable.image_thing_18),
            Thing("Шорты", "Шорты синие", R.drawable.image_thing_19),
            Thing("Кофта", "Кофта оверсайз, черная", R.drawable.image_thing_20),

        )
    }
}
