package ru.job4j.queue;

import java.util.PriorityQueue;

import static ru.job4j.queue.PriorityQueueRunner.printTransactionElements;

public class Transaction {
    private int id;

    private String purpose;

    private int amount;

    public Transaction(int id, String purpose, int amount) {
        this.id = id;
        this.purpose = purpose;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{"
                + "id=" + id
                + ", purpose='" + purpose + '\''
                + ", amount=" + amount
                + '}';
    }

    public static void main(String[] args) {
        PriorityQueue<Transaction> transactions = new PriorityQueue<>(new TransactionSortDescByAmount());
        transactions.offer(new Transaction(1, "number_1", 100));
        transactions.offer(new Transaction(2, "number_2", 1000));
        transactions.offer(new Transaction(3, "number_3", 85));
        transactions.offer(new Transaction(3, "number_4", 100));
        transactions.offer(new Transaction(4, "number_5", 1000));
        transactions.offer(new Transaction(5, "number_6", 550));
        transactions.offer(new Transaction(6, "number_7", 100));
        transactions.offer(new Transaction(8, "number_8", 1000));
        printTransactionElements(transactions);
    }
}