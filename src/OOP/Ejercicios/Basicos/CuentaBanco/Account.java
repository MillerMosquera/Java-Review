package OOP.Ejercicios.Basicos.CuentaBanco;

public class Account {

    private String holder;
    private double amount;

    public Account(String holder) {
        this.holder = holder;
        this.amount = 0.0;
    }

    public Account(String holder, double cantidad) {
        this.holder = holder;
        if (cantidad < 0) {
            this.amount = 0;
        } else this.amount = cantidad;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    //Deposita la cantidad
    public void deposit(double cantidad) {
        if (amount > 0) {
            amount += cantidad;
        } else System.out.println("Debe ser mayor que 0");
    }

    //Retira la cantidad
    public void withdraw(double cantidad) {
        if (this.amount - cantidad > 0) {
            this.amount -= cantidad;
        } else this.amount = 0;
    }

    public String toString() {
        return "Holder " + holder
                + " Amount " + amount;
    }
}

