package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TrainingCompletionDuration implements ValuedEnum {
    Week("week"),
    Fortnite("fortnite"),
    Month("month"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TrainingCompletionDuration(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TrainingCompletionDuration forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "week": return Week;
            case "fortnite": return Fortnite;
            case "month": return Month;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
