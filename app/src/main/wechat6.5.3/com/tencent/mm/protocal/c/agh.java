package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class agh extends aqp {
    public int eet;
    public LinkedList<abm> eeu = new LinkedList();
    public int mFW;
    public int miR;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            aVar.dV(2, this.eet);
            aVar.d(3, 8, this.eeu);
            aVar.dV(4, this.miR);
            aVar.dV(5, this.mFW);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            return (((r0 + a.a.a.a.dS(2, this.eet)) + a.a.a.a.c(3, 8, this.eeu)) + a.a.a.a.dS(4, this.miR)) + a.a.a.a.dS(5, this.mFW);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.eeu.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = com.tencent.mm.ba.a.a(aVar2); r0 > 0; r0 = com.tencent.mm.ba.a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            agh com_tencent_mm_protocal_c_agh = (agh) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            com.tencent.mm.ba.a enVar;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        enVar = new en();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_agh.mPU = enVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_agh.eet = aVar3.pMj.mH();
                    return 0;
                case 3:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        enVar = new abm();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_agh.eeu.add(enVar);
                    }
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_agh.miR = aVar3.pMj.mH();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_agh.mFW = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}