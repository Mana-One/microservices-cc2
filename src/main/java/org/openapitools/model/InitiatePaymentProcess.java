package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BuyerInfo;
import org.openapitools.model.CreditCardInfo;
import org.openapitools.model.PaymentOrder;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InitiatePaymentProcess
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-14T20:02:41.255398+02:00[Europe/Paris]")
public class InitiatePaymentProcess   {

  @JsonProperty("buyer_info")
  private BuyerInfo buyerInfo;

  @JsonProperty("checkout_id")
  private String checkoutId;

  @JsonProperty("credit_card_info")
  private CreditCardInfo creditCardInfo;

  @JsonProperty("payment_orders")
  @Valid
  private List<PaymentOrder> paymentOrders = new ArrayList<>();

  public InitiatePaymentProcess buyerInfo(BuyerInfo buyerInfo) {
    this.buyerInfo = buyerInfo;
    return this;
  }

  /**
   * Get buyerInfo
   * @return buyerInfo
  */
  @NotNull @Valid 
  @Schema(name = "buyer_info", required = true)
  public BuyerInfo getBuyerInfo() {
    return buyerInfo;
  }

  public void setBuyerInfo(BuyerInfo buyerInfo) {
    this.buyerInfo = buyerInfo;
  }

  public InitiatePaymentProcess checkoutId(String checkoutId) {
    this.checkoutId = checkoutId;
    return this;
  }

  /**
   * Get checkoutId
   * @return checkoutId
  */
  @NotNull 
  @Schema(name = "checkout_id", required = true)
  public String getCheckoutId() {
    return checkoutId;
  }

  public void setCheckoutId(String checkoutId) {
    this.checkoutId = checkoutId;
  }

  public InitiatePaymentProcess creditCardInfo(CreditCardInfo creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
    return this;
  }

  /**
   * Get creditCardInfo
   * @return creditCardInfo
  */
  @NotNull @Valid 
  @Schema(name = "credit_card_info", required = true)
  public CreditCardInfo getCreditCardInfo() {
    return creditCardInfo;
  }

  public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
    this.creditCardInfo = creditCardInfo;
  }

  public InitiatePaymentProcess paymentOrders(List<PaymentOrder> paymentOrders) {
    this.paymentOrders = paymentOrders;
    return this;
  }

  public InitiatePaymentProcess addPaymentOrdersItem(PaymentOrder paymentOrdersItem) {
    this.paymentOrders.add(paymentOrdersItem);
    return this;
  }

  /**
   * Get paymentOrders
   * @return paymentOrders
  */
  @NotNull @Valid 
  @Schema(name = "payment_orders", required = true)
  public List<PaymentOrder> getPaymentOrders() {
    return paymentOrders;
  }

  public void setPaymentOrders(List<PaymentOrder> paymentOrders) {
    this.paymentOrders = paymentOrders;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentProcess initiatePaymentProcess = (InitiatePaymentProcess) o;
    return Objects.equals(this.buyerInfo, initiatePaymentProcess.buyerInfo) &&
        Objects.equals(this.checkoutId, initiatePaymentProcess.checkoutId) &&
        Objects.equals(this.creditCardInfo, initiatePaymentProcess.creditCardInfo) &&
        Objects.equals(this.paymentOrders, initiatePaymentProcess.paymentOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerInfo, checkoutId, creditCardInfo, paymentOrders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentProcess {\n");
    sb.append("    buyerInfo: ").append(toIndentedString(buyerInfo)).append("\n");
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
    sb.append("    creditCardInfo: ").append(toIndentedString(creditCardInfo)).append("\n");
    sb.append("    paymentOrders: ").append(toIndentedString(paymentOrders)).append("\n");
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

