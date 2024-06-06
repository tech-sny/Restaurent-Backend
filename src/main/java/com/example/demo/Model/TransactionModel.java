package com.example.demo.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="transaction")
public class TransactionModel {
    @Id
    private String transactionId;
    private String bankTransactionId;
    private String currency;
    private String responseCode;
    private String responseMessage;
    private String gatewayName;
    private String bankName;
    private String paymentMode;
    private String checksumHash;
}
