package Ex2;

class Deposit implements Runnable{
        private Bank bank;

        public Deposit (Bank bank){
            this.bank = bank;
        }
        public void run() {
            final long I=1000;

            for (long i = 0; i < I; i++)
                this.bank.deposit(100);
        }
    }
