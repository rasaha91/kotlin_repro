package kotlin_repro;

import kotlin_repro.KotlinConsumptionOnly.bar;

fun ConsumeJavaFromKotlin() : String {
    return bar.GetName();
}