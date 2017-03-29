
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sums" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Average" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="StandardDeviation" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="skewness" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Kurtosis" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sums",
    "average",
    "standardDeviation",
    "skewness",
    "kurtosis"
})
@XmlRootElement(name = "GetStatisticsResponse")
public class GetStatisticsResponse {

    @XmlElement(name = "Sums")
    protected double sums;
    @XmlElement(name = "Average")
    protected double average;
    @XmlElement(name = "StandardDeviation")
    protected double standardDeviation;
    protected double skewness;
    @XmlElement(name = "Kurtosis")
    protected double kurtosis;

    /**
     * Gets the value of the sums property.
     * 
     */
    public double getSums() {
        return sums;
    }

    /**
     * Sets the value of the sums property.
     * 
     */
    public void setSums(double value) {
        this.sums = value;
    }

    /**
     * Gets the value of the average property.
     * 
     */
    public double getAverage() {
        return average;
    }

    /**
     * Sets the value of the average property.
     * 
     */
    public void setAverage(double value) {
        this.average = value;
    }

    /**
     * Gets the value of the standardDeviation property.
     * 
     */
    public double getStandardDeviation() {
        return standardDeviation;
    }

    /**
     * Sets the value of the standardDeviation property.
     * 
     */
    public void setStandardDeviation(double value) {
        this.standardDeviation = value;
    }

    /**
     * Gets the value of the skewness property.
     * 
     */
    public double getSkewness() {
        return skewness;
    }

    /**
     * Sets the value of the skewness property.
     * 
     */
    public void setSkewness(double value) {
        this.skewness = value;
    }

    /**
     * Gets the value of the kurtosis property.
     * 
     */
    public double getKurtosis() {
        return kurtosis;
    }

    /**
     * Sets the value of the kurtosis property.
     * 
     */
    public void setKurtosis(double value) {
        this.kurtosis = value;
    }

}
