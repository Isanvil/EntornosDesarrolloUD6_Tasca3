import java.math.BigInteger;

public class Compte {
    private String iban;

    public Compte() {
        this.iban = iban;
    }

    public boolean compruebaIBAN(String iban) {
        if (iban.matches("^ES\\d{22}$")) {
            return true;
        }
        return false;
    }

    public String generaIBAN(String entitat, String oficina, String dc, String compte) {
        boolean flagCheck = true;
        String ibanNum = "";
        if ((entitat + oficina + dc + compte).length() == 20) {
            if (entitat.matches("^[0-9]{4}")) {
                ibanNum += entitat;
            } else {
                flagCheck = false;
            }
            if (oficina.matches("^[0-9]{4}")) {
                ibanNum += oficina;
            } else {
                flagCheck = false;
            }
            if (dc.matches("^[0-9]{2}")) {
                ibanNum += dc;
            } else {
                flagCheck = false;
            }
            if (compte.matches("^[0-9]{10}")) {
                ibanNum += compte + "142800";
            } else {
                flagCheck = false;
            }

            BigInteger num =  new BigInteger(ibanNum);
            BigInteger n97 = new BigInteger("97");
            BigInteger n98 = new BigInteger("98");
            BigInteger numDcDivide = num.remainder(n97);
            BigInteger numDcSubstract = n98.subtract(numDcDivide);
            if (numDcSubstract.toString().length() < 2){
                if(flagCheck){
                    return "ES" + "0" + numDcSubstract + ibanNum;
                }
            } else {
                if(flagCheck){
                    return "ES" + numDcSubstract + ibanNum;
                }
            }
        }
        return null;
    }
}
