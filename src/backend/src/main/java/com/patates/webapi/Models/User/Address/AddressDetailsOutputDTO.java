package com.patates.webapi.Models.User.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDetailsOutputDTO {
  private String addressId;
  private String header;
  private String address;
  private String city;
  private String county;
  private String zipcode;
}
