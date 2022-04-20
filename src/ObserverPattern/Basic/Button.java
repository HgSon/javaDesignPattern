package ObserverPattern.Basic;

public class Button {

	public void onClick() {
		if(onclickListener != null) {
			onclickListener.onClick(this);
		}
	}

	public interface OnclickListener {
		void onClick(Button button);
	}

	private OnclickListener onclickListener;

	public void setOnclickListener(OnclickListener onclickListener) {
		this.onclickListener = onclickListener;
	}
}
