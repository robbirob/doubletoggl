package com.example.doubtogg.features;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;

public enum BookstoreFeatures implements Feature {
  @EnabledByDefault
  @Label("Provide extended information about a book")
  EXTENDED_INFORMATION,

  @Label("Enable public prices endpoint for books")
  PUBLIC_PRICES,

  @Label("Wishlist")
  BOOK_WISHLIST
}
