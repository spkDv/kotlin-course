package com.maestro.kotlincourse.lesson3

import java.time.LocalDate


val event: String = "Hackathon Survival"

val eventDate: LocalDate = LocalDate.of(2024,9, 14) // Дата

lateinit var eventLocation: String

var budgetDetails: Map<String, Float> = mapOf(
    "Экипировка" to 1221f,
    "Кейтеринг" to 2333f,
    "Другие операционные расходы" to 5444f
)

var participantCount: Int = 0
    set(value) {
        field = if (value >= 0) value else 0
    }

const val duration: Int = 13

lateinit var supplier: Map<String, String>

var eventStatus: String = "Не "

val sponsors: List<String> = listOf("KFC", "DDT", "Microflot")

var budget: Int = 1000000
var internetStatus: String? = null

var logisticsInfo: String? =

var teamCount: Int = 0
    set(value) {
        field = if (value >= 0) value else 0
    }

val taskList: List<String> = listOf("взломать пентагон", "починить пентагон")

lateinit var evcuation: String

val listequipmentaccessible: List<String> = listOf("10 - PC", "15 - laptop")

val listequipmentfree: List<String> = listOf("2 - PC", "2 - Laptop")

lateinit var mealSchedule: String

val backupPlan: String = "План мероприятий на случай сбоев"

val judges: List<String> = listOf("Vladimir", "Nikolai")

val feedbackProcedures: List<String> = listOf("152fz", "otziv")

val privacyPolicy: String = "Политика конфиденциальности"

var privateFeedback: Map<String, String>? = null

var currentTemperature: Float = 24.0f

val networkPerformance: String = "Мониторинг и анализ производительности сети"

var lightingLevel: Float = 0.0f
    set(value){
        field = if (value in 0.0..99.9) value else 30f
    }

val eventlog: List<String> = listOf("Хакатон начало", "Хакатон конец")

var medicalSupport : Boolean = true

val securityPlans: String = "Планы и процедуры для обеспечения безопасности мероприятия"

val regNumber: String = "171512"

const val maxNoise: Int = 100

var noiseAlert: Boolean = false

lateinit var eventFormat: String

var freeSeats: Int  = 0
    set(value){
        field = if (value > 0 ) value else 0
    }

val pressPlan: String? = null

val detailinforasionteams: String? = null

var permisstatus: Boolean = true

var exclusiveAccess: Boolean = false

val partnerList: List<String> = listOf("IBM", "CUSU")

val eventReport: String by lazy { "Отчет, включающий фотографии, видео и отзывы" }

val prizeDistribution: String = "План распределения призов"

var contactlistam: List<String> = listOf("медицинский персонал 112", "Другие важные службы 911")

val specialConditions: String = "Особые условия для участников с ограниченными возможностями"

var generalMoodParticipants: String = "Среднее"

lateinit var detailedEventPlan: String

lateinit var specialGuest: String = "Bill Gates"

const val maxCapacity: Int = 1000

const val standardWorkHours: Int = 5

val currentTemperatureroom: Float = 20.0f