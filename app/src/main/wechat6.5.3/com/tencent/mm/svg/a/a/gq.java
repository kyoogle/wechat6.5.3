package com.tencent.mm.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class gq extends c {
    private final int height = 96;
    private final int width = 96;

    protected final int j(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix d = c.d(looper);
                float[] c = c.c(looper);
                Paint g = c.g(looper);
                g.setFlags(385);
                g.setStyle(Style.FILL);
                Paint g2 = c.g(looper);
                g2.setFlags(385);
                g2.setStyle(Style.STROKE);
                g.setColor(WebView.NIGHT_MODE_COLOR);
                g2.setStrokeWidth(1.0f);
                g2.setStrokeCap(Cap.BUTT);
                g2.setStrokeJoin(Join.MITER);
                g2.setStrokeMiter(4.0f);
                g2.setPathEffect(null);
                c.a(g2, looper).setStrokeWidth(1.0f);
                canvas.save();
                c = c.a(c, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 16.0f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                canvas.save();
                Paint a = c.a(g, looper);
                a.setColor(-3487030);
                c = c.a(c, -1.0f, 0.0f, 140.0f, 0.0f, 1.0f, 0.0f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                Path h = c.h(looper);
                h.moveTo(62.981445f, 34.0f);
                h.lineTo(62.981445f, 57.0f);
                h.lineTo(76.99115f, 57.0f);
                h.lineTo(76.99115f, 34.0f);
                h.lineTo(62.981445f, 34.0f);
                h.close();
                h.moveTo(64.00189f, 35.0f);
                h.lineTo(64.00189f, 54.0f);
                h.lineTo(75.96838f, 53.90808f);
                h.lineTo(75.96838f, 35.0f);
                h.lineTo(64.00189f, 35.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                Paint a2 = c.a(g, looper);
                a2.setColor(-3487030);
                h = c.h(looper);
                h.moveTo(76.20998f, 34.0f);
                h.cubicTo(75.08325f, 33.4433f, 72.872185f, 33.079494f, 70.37098f, 33.01155f);
                h.cubicTo(70.0893f, 33.0039f, 69.80395f, 33.0f, 69.516045f, 33.0f);
                h.cubicTo(66.67165f, 33.0f, 64.05939f, 33.380604f, 62.796413f, 34.0f);
                h.lineTo(76.20998f, 34.0f);
                h.close();
                h.moveTo(75.825836f, 57.166668f);
                h.cubicTo(74.62209f, 57.628895f, 72.61311f, 57.927544f, 70.37098f, 57.98845f);
                h.cubicTo(70.0893f, 57.9961f, 69.80395f, 58.0f, 69.516045f, 58.0f);
                h.cubicTo(66.936455f, 58.0f, 64.547775f, 57.686962f, 63.183327f, 57.166668f);
                h.lineTo(75.825836f, 57.166668f);
                h.lineTo(75.825836f, 57.166668f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(g, looper);
                a2.setColor(-12337128);
                h = c.h(looper);
                h.moveTo(24.011108f, 30.948933f);
                h.cubicTo(26.315693f, 34.58573f, 30.375906f, 37.0f, 35.0f, 37.0f);
                h.cubicTo(42.179703f, 37.0f, 48.0f, 31.1797f, 48.0f, 24.0f);
                h.cubicTo(48.0f, 16.8203f, 42.179703f, 11.0f, 35.0f, 11.0f);
                h.cubicTo(27.8203f, 11.0f, 22.0f, 16.8203f, 22.0f, 24.0f);
                h.lineTo(22.0f, 24.0f);
                h.lineTo(26.0f, 24.0f);
                h.cubicTo(26.0f, 19.029438f, 30.029438f, 15.0f, 35.0f, 15.0f);
                h.cubicTo(39.970562f, 15.0f, 44.0f, 19.029438f, 44.0f, 24.0f);
                h.cubicTo(44.0f, 28.970562f, 39.970562f, 33.0f, 35.0f, 33.0f);
                h.cubicTo(31.756393f, 33.0f, 28.913553f, 31.28411f, 27.329683f, 28.710527f);
                h.lineTo(27.0f, 28.932901f);
                h.lineTo(27.0f, 29.0f);
                h.lineTo(26.90052f, 29.0f);
                h.lineTo(24.011108f, 30.948933f);
                h.lineTo(24.011108f, 30.948933f);
                h.close();
                h.moveTo(20.0f, 24.0f);
                h.lineTo(24.571232f, 28.0f);
                h.lineTo(29.0f, 24.0f);
                h.lineTo(20.0f, 24.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                Paint a3 = c.a(g, looper);
                a3.setColor(-3487030);
                Path h2 = c.h(looper);
                h2.moveTo(26.0f, 52.0f);
                h2.lineTo(44.0f, 52.0f);
                h2.lineTo(44.0f, 56.0f);
                h2.lineTo(26.0f, 56.0f);
                h2.lineTo(26.0f, 52.0f);
                h2.close();
                canvas.drawPath(h2, a3);
                canvas.restore();
                canvas.save();
                a2 = c.a(g, looper);
                a2.setColor(-2105377);
                h = c.h(looper);
                h.moveTo(60.0f, 53.0f);
                h.lineTo(1.9917458f, 53.0f);
                h.cubicTo(0.89770234f, 53.0f, 0.0f, 52.105953f, 0.0f, 51.00309f);
                h.lineTo(0.0f, 1.9969095f);
                h.cubicTo(0.0f, 0.8976762f, 0.89173496f, 0.0f, 1.9917458f, 0.0f);
                h.lineTo(69.008255f, 0.0f);
                h.cubicTo(70.102295f, 0.0f, 71.0f, 0.89404684f, 71.0f, 1.9969095f);
                h.lineTo(71.0f, 32.0f);
                h.lineTo(68.0f, 32.0f);
                h.lineTo(68.0f, 4.9931736f);
                h.cubicTo(68.0f, 4.4446588f, 67.55714f, 4.0f, 66.99471f, 4.0f);
                h.lineTo(5.005287f, 4.0f);
                h.cubicTo(4.4500823f, 4.0f, 4.0f, 4.4464755f, 4.0f, 4.9931736f);
                h.lineTo(4.0f, 44.006824f);
                h.cubicTo(4.0f, 44.55534f, 4.4428625f, 45.0f, 5.005287f, 45.0f);
                h.lineTo(60.0f, 45.0f);
                h.lineTo(60.0f, 53.0f);
                h.close();
                h.moveTo(19.0f, 58.0f);
                h.lineTo(19.0f, 57.00937f);
                h.cubicTo(19.0f, 56.44335f, 19.444485f, 56.0f, 19.992786f, 56.0f);
                h.lineTo(50.007214f, 56.0f);
                h.cubicTo(50.547638f, 56.0f, 51.0f, 56.45191f, 51.0f, 57.00937f);
                h.lineTo(51.0f, 58.0f);
                h.lineTo(19.0f, 58.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}