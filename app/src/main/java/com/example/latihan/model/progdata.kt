package com.example.latihan.model

import com.example.latihan.R

object progdata {
    private val progName = arrayOf(
        "Ruby",
        "Rails",
        "Python",
        "Java Script",
        "PHP"
    )
    private val detail = arrayOf(
        "Ruby is an open source and fully object-oriented programming language.",
        "Rails is a server-side web app development framework written in Ruby language.",
        "Python is interpreted scripting and object-oriented programming language.",
        "Java Script is an object-based scripting language.",
        "PHP is an interpreted language, i.e, there is no need for compilation"
    )
    private val progPoster = intArrayOf(
        R.drawable.ruby,
        R.drawable.rails,
        R.drawable.python,
        R.drawable.js,
        R.drawable.php
    )
    val listProg: ArrayList<Prog>
        get() {
            val list = arrayListOf<Prog>()
            for(position in progName.indices) {
                val prog = Prog()
                prog.name = progName[position]
                prog.detail = detail[position]
                prog.poster = progPoster[position]
                list.add(prog)
            }
            return list
        }
}