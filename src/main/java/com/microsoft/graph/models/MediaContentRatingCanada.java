package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MediaContentRatingCanada implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Movies rating selected for Canada. Possible values are: allAllowed, allBlocked, general, parentalGuidance, agesAbove14, agesAbove18, restricted. */
    private RatingCanadaMoviesType _movieRating;
    /** TV rating selected for Canada. Possible values are: allAllowed, allBlocked, children, childrenAbove8, general, parentalGuidance, agesAbove14, agesAbove18. */
    private RatingCanadaTelevisionType _tvRating;
    /**
     * Instantiates a new mediaContentRatingCanada and sets the default values.
     * @return a void
     */
    public MediaContentRatingCanada() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mediaContentRatingCanada
     */
    @javax.annotation.Nonnull
    public static MediaContentRatingCanada createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MediaContentRatingCanada();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MediaContentRatingCanada currentObject = this;
        return new HashMap<>(2) {{
            this.put("movieRating", (n) -> { currentObject.setMovieRating(n.getEnumValue(RatingCanadaMoviesType.class)); });
            this.put("tvRating", (n) -> { currentObject.setTvRating(n.getEnumValue(RatingCanadaTelevisionType.class)); });
        }};
    }
    /**
     * Gets the movieRating property value. Movies rating selected for Canada. Possible values are: allAllowed, allBlocked, general, parentalGuidance, agesAbove14, agesAbove18, restricted.
     * @return a ratingCanadaMoviesType
     */
    @javax.annotation.Nullable
    public RatingCanadaMoviesType getMovieRating() {
        return this._movieRating;
    }
    /**
     * Gets the tvRating property value. TV rating selected for Canada. Possible values are: allAllowed, allBlocked, children, childrenAbove8, general, parentalGuidance, agesAbove14, agesAbove18.
     * @return a ratingCanadaTelevisionType
     */
    @javax.annotation.Nullable
    public RatingCanadaTelevisionType getTvRating() {
        return this._tvRating;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("movieRating", this.getMovieRating());
        writer.writeEnumValue("tvRating", this.getTvRating());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the movieRating property value. Movies rating selected for Canada. Possible values are: allAllowed, allBlocked, general, parentalGuidance, agesAbove14, agesAbove18, restricted.
     * @param value Value to set for the movieRating property.
     * @return a void
     */
    public void setMovieRating(@javax.annotation.Nullable final RatingCanadaMoviesType value) {
        this._movieRating = value;
    }
    /**
     * Sets the tvRating property value. TV rating selected for Canada. Possible values are: allAllowed, allBlocked, children, childrenAbove8, general, parentalGuidance, agesAbove14, agesAbove18.
     * @param value Value to set for the tvRating property.
     * @return a void
     */
    public void setTvRating(@javax.annotation.Nullable final RatingCanadaTelevisionType value) {
        this._tvRating = value;
    }
}
