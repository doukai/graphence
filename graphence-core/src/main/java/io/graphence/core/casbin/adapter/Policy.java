package io.graphence.core.casbin.adapter;

import com.dslplatform.json.CompiledJson;
import org.eclipse.microprofile.graphql.Type;

import java.util.List;

@Type
@CompiledJson
public class Policy {
    private int id;
    private String ptype;
    private String v0;
    private String v1;
    private String v2;
    private String v3;
    private String v4;
    private String v5;

    public Policy() {
    }

    public Policy(List<String> line) {
        if (line != null) {
            if (line.size() >= 1 && line.get(0) != null) {
                ptype = line.get(0);
            }
            if (line.size() >= 2 && line.get(1) != null) {
                v0 = line.get(1);
            }
            if (line.size() >= 3 && line.get(2) != null) {
                v1 = line.get(2);
            }
            if (line.size() >= 4 && line.get(3) != null) {
                v2 = line.get(3);
            }
            if (line.size() >= 5 && line.get(4) != null) {
                v3 = line.get(4);
            }
            if (line.size() >= 6 && line.get(5) != null) {
                v4 = line.get(5);
            }
            if (line.size() >= 7 && line.get(6) != null) {
                v5 = line.get(6);
            }
        }
    }

    public int getId() {
        return id;
    }

    public Policy setId(int id) {
        this.id = id;
        return this;
    }

    public String getPtype() {
        return ptype;
    }

    public Policy setPtype(String ptype) {
        this.ptype = ptype;
        return this;
    }

    public String getV0() {
        return v0;
    }

    public Policy setV0(String v0) {
        this.v0 = v0;
        return this;
    }

    public String getV1() {
        return v1;
    }

    public Policy setV1(String v1) {
        this.v1 = v1;
        return this;
    }

    public String getV2() {
        return v2;
    }

    public Policy setV2(String v2) {
        this.v2 = v2;
        return this;
    }

    public String getV3() {
        return v3;
    }

    public Policy setV3(String v3) {
        this.v3 = v3;
        return this;
    }

    public String getV4() {
        return v4;
    }

    public Policy setV4(String v4) {
        this.v4 = v4;
        return this;
    }

    public String getV5() {
        return v5;
    }

    public Policy setV5(String v5) {
        this.v5 = v5;
        return this;
    }

    @Override
    public String toString() {
        String lineText = getPtype();
        if (getV0() != null) {
            lineText += ", " + getV0();
        }
        if (getV1() != null) {
            lineText += ", " + getV1();
        }
        if (getV2() != null) {
            lineText += ", " + getV2();
        }
        if (getV3() != null) {
            lineText += ", " + getV3();
        }
        if (getV4() != null) {
            lineText += ", " + getV4();
        }
        if (getV5() != null) {
            lineText += ", " + getV5();
        }
        return lineText;
    }
}
