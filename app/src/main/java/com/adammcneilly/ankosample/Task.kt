package com.adammcneilly.ankosample

/**
 * A task is something that must be completed by the user.
 *
 * Created by adam.mcneilly on 5/28/17.
 */
data class Task(var description: String = "", var isCompleted: Boolean = false)