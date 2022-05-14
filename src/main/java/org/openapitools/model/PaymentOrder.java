package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PaymentOrder
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-14T20:02:41.255398+02:00[Europe/Paris]")
public class PaymentOrder   {

  @JsonProperty("seller_account")
  private String sellerAccount;

  @JsonProperty("amount")
  private String amount;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("payment_order_id")
  private String paymentOrderId;

  public PaymentOrder sellerAccount(String sellerAccount) {
    this.sellerAccount = sellerAccount;
    return this;
  }

  /**
   * Get sellerAccount
   * @return sellerAccount
  */
  @NotNull 
  @Schema(name = "seller_account", required = true)
  public String getSellerAccount() {
    return sellerAccount;
  }

  public void setSellerAccount(String sellerAccount) {
    this.sellerAccount = sellerAccount;
  }

  public PaymentOrder amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", required = true)
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public PaymentOrder currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @NotNull 
  @Schema(name = "currency", required = true)
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PaymentOrder paymentOrderId(String paymentOrderId) {
    this.paymentOrderId = paymentOrderId;
    return this;
  }

  /**
   * Get paymentOrderId
   * @return paymentOrderId
  */
  @NotNull 
  @Schema(name = "payment_order_id", required = true)
  public String getPaymentOrderId() {
    return paymentOrderId;
  }

  public void setPaymentOrderId(String paymentOrderId) {
    this.paymentOrderId = paymentOrderId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentOrder paymentOrder = (PaymentOrder) o;
    return Objects.equals(this.sellerAccount, paymentOrder.sellerAccount) &&
        Objects.equals(this.amount, paymentOrder.amount) &&
        Objects.equals(this.currency, paymentOrder.currency) &&
        Objects.equals(this.paymentOrderId, paymentOrder.paymentOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerAccount, amount, currency, paymentOrderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentOrder {\n");
    sb.append("    sellerAccount: ").append(toIndentedString(sellerAccount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentOrderId: ").append(toIndentedString(paymentOrderId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

