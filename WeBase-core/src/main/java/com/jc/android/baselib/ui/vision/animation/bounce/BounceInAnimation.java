package com.jc.android.baselib.ui.vision.animation.bounce;

import android.view.View;

import com.jc.android.baselib.ui.vision.AbsBaseAnimation;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;


public class BounceInAnimation extends AbsBaseAnimation {

	@Override
	protected void animate(AnimatorSet set, View target, int index) {
		set.playTogether(
                ObjectAnimator.ofFloat(target,"alpha",0,1, 1 ,1),
                ObjectAnimator.ofFloat(target,"scaleX",0.3f,1.05f,0.9f,1),
                ObjectAnimator.ofFloat(target,"scaleY",0.3f,1.05f,0.9f,1)
        );
	}

}
