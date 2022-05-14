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
 * BuyerInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-14T20:02:41.255398+02:00[Europe/Paris]")
public class BuyerInfo   {

  @JsonProperty("id")
  private String id;

  @JsonProperty("fullname")
  private String fullname;

  public BuyerInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", required = true)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BuyerInfo fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

  /**
   * Get fullname
   * @return fullname
  */
  @NotNull 
  @Schema(name = "fullname", required = true)
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyerInfo buyerInfo = (BuyerInfo) o;
    return Objects.equals(this.id, buyerInfo.id) &&
        Objects.equals(this.fullname, buyerInfo.fullname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fullname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyerInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
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

