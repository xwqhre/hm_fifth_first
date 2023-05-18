package com.example.les_fifth_first

import android.graphics.Color
import android.provider.CalendarContract.Colors
import android.widget.Toast

class Presenter {
    lateinit var view: CounterView
    var model = CounterModel()

    fun decrement() {
        model.decrement()
        view.showCount(model.count.toString())
    }

    fun init(view: CounterView) {
        this.view = view
    }

    fun increment() {
        model.increment()
        view.showCount(model.count.toString())

        if (model.count == 10) {
            view.toast("Congratulations")
        }

        if (model.count == 15) {
            view.color(Color.GREEN)

        }
    }
}

