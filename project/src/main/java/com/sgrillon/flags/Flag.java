package com.sgrillon.flags;

/**
 * 
 * @author sgrillon
 *
 */
public class Flag {

    /**
     * Code ISO 3166-1 numérique
     */
    private int num;

    /**
     * Code ISO 3166-1 alpha2
     */
    private String alpha2;

    /**
     * Code ISO 3166-1 alpha3
     */
    private String alpha3;

    /**
     * label of country
     */
    private String label;

    /**
     * SVG of flag
     */
    private String svg;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getAlpha2() {
        return alpha2;
    }

    public void setAlpha2(String alpha2) {
        this.alpha2 = alpha2;
    }

    public String getAlpha3() {
        return alpha3;
    }

    public void setAlpha3(String alpha3) {
        this.alpha3 = alpha3;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getSvg() {
        return svg;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }

}
