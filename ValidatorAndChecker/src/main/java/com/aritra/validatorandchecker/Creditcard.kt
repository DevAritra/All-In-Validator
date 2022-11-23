package com.aritra.validatorandchecker

import java.util.regex.Pattern

class Creditcard {

    fun Cardvalidator(cardnumber: String): String {
        val VISA: Pattern = Pattern.compile("^4[0-9]{12}(?:[0-9]{3})?\$")
        val AMEX: Pattern = Pattern.compile("^3[47][0-9]{13}$")
        val DINERS_CLUB: Pattern = Pattern.compile("^3(?:0[0-5]|[68][0-9])[0-9]{11}\$")
        val DISCOVER: Pattern =
            Pattern.compile("^65[4-9][0-9]{13}|64[4-9][0-9]{13}|6011[0-9]{12}|(622(?:12[6-9]|1[3-9][0-9]|[2-8][0-9][0-9]|9[01][0-9]|92[0-5])[0-9]{10})\$")
        val JCB: Pattern = Pattern.compile("^(?:2131|1800|35\\d{3})\\d{11}\$")
        val MASTERCARD: Pattern =
            Pattern.compile("^5[1-5][0-9]{5,}|222[1-9][0-9]{3,}|22[3-9][0-9]{4,}|2[3-6][0-9]{5,}|27[01][0-9]{4,}|2720[0-9]{3,}\$")


        if (VISA.matcher(cardnumber).matches()) {
            return "VISA"
        } else if (AMEX.matcher(cardnumber).matches()) {
            return "AMERICAN EXPRESS"
        } else if (DINERS_CLUB.matcher(cardnumber).matches()) {
            return "DINERS CLUB"
        } else if (DISCOVER.matcher(cardnumber).matches()) {
            return "DISCOVER"
        } else if (JCB.matcher(cardnumber).matches()) {
            return "JCB"
        } else if (MASTERCARD.matcher(cardnumber).matches()) {
            return "MASTERCARD"
        } else {
            return "UNKNOWN Card"
        }

    }

    fun Cardtype(cardnumber: String): String {

        val VISA: Pattern = Pattern.compile("^4$")
        val AMEX: Pattern = Pattern.compile("^3[47]$")
        val JCB: Pattern = Pattern.compile("^(?:2131|1800|35)$")
        val DISCOVER: Pattern =
            Pattern.compile("^6$")
        val MASTERCARD: Pattern =
            Pattern.compile("^5|222$")
        val DINERS_CLUB: Pattern = Pattern.compile("^3(?:0|6|8)$")


        if (VISA.matcher(cardnumber).matches()) {
            return "VISA"
        } else if (AMEX.matcher(cardnumber).matches()) {
            return "AMERICAN EXPRESS"
        } else if (DINERS_CLUB.matcher(cardnumber).matches()) {
            return "DINERS CLUB"
        } else if (DISCOVER.matcher(cardnumber).matches()) {
            return "DISCOVER"
        } else if (JCB.matcher(cardnumber).matches()) {
            return "JCB"
        } else if (MASTERCARD.matcher(cardnumber).matches()) {
            return "MASTERCARD"
        } else {
            return "UNKNOWN Card"
        }
    }

}