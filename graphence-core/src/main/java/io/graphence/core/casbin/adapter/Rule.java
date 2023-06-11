package io.graphence.core.casbin.adapter;

public class Rule {
    private int id;
    private String ptype;
    private String v0;
    private String v1;
    private String v2;
    private String v3;
    private String v4;
    private String v5;

    public int getId() {
        return id;
    }

    public Rule setId(int id) {
        this.id = id;
        return this;
    }

    public String getPtype() {
        return ptype;
    }

    public Rule setPtype(String ptype) {
        this.ptype = ptype;
        return this;
    }

    public String getV0() {
        return v0;
    }

    public Rule setV0(String v0) {
        this.v0 = v0;
        return this;
    }

    public String getV1() {
        return v1;
    }

    public Rule setV1(String v1) {
        this.v1 = v1;
        return this;
    }

    public String getV2() {
        return v2;
    }

    public Rule setV2(String v2) {
        this.v2 = v2;
        return this;
    }

    public String getV3() {
        return v3;
    }

    public Rule setV3(String v3) {
        this.v3 = v3;
        return this;
    }

    public String getV4() {
        return v4;
    }

    public Rule setV4(String v4) {
        this.v4 = v4;
        return this;
    }

    public String getV5() {
        return v5;
    }

    public Rule setV5(String v5) {
        this.v5 = v5;
        return this;
    }
}
