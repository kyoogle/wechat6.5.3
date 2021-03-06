package com.tencent.mm.plugin.product.b;

import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.yb;
import com.tencent.mm.protocal.c.yc;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.v.b;
import com.tencent.mm.v.b.a;
import com.tencent.mm.v.e;
import com.tencent.mm.v.k;
import java.util.List;

public final class h extends k implements j {
    private b cif;
    private e cii;
    public String hQx;
    public m hQy;
    public List<n> hQz;

    public h(m mVar, String str) {
        a aVar = new a();
        aVar.czn = new yb();
        aVar.czo = new yc();
        aVar.uri = "/cgi-bin/micromsg-bin/getproductdetail";
        aVar.czm = 553;
        aVar.czp = 0;
        aVar.czq = 0;
        this.cif = aVar.Bv();
        yb ybVar = (yb) this.cif.czk.czs;
        this.hQx = str;
        ybVar.mzY = str;
        v.d("MicroMsg.NetSceneMallGetProductDetail", "pid " + str);
        ybVar.efl = 0;
        this.hQy = mVar;
    }

    public final void a(int i, int i2, int i3, String str, p pVar, byte[] bArr) {
        yc ycVar = (yc) ((b) pVar).czl.czs;
        if (!be.kS(ycVar.mAa)) {
            v.d("MicroMsg.NetSceneMallGetProductDetail", "resp.ProductInfo " + ycVar.mAa);
            this.hQy = m.a(this.hQy, ycVar.mAa);
        }
        if (i3 == 0 && ycVar.mjY != 0) {
            i3 = ycVar.mjY;
            str = ycVar.mjZ;
        }
        if (!be.kS(ycVar.mAb)) {
            v.d("MicroMsg.NetSceneMallGetProductDetail", "resp.RecommendInfo " + ycVar.mAb);
            this.hQz = n.parse(ycVar.mAb);
        }
        v.d("MicroMsg.NetSceneMallGetProductDetail", "errCode " + i3 + ", errMsg " + str);
        this.cii.a(i2, i3, str, this);
    }

    public final int getType() {
        return 553;
    }

    public final int a(com.tencent.mm.network.e eVar, e eVar2) {
        this.cii = eVar2;
        return a(eVar, this.cif, this);
    }
}
