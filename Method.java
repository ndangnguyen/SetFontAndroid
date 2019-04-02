public static void setFont(Context context, ViewGroup group) {
        int count = group.getChildCount();
        View v;
        Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/Sansation_Regular.ttf");
        if(Build.VERSION.SDK_INT < 21 && LogoActivity.language.equals("vi"))
            font = Typeface.DEFAULT;
        if (android.os.Build.MODEL.contains("BNTV600") &&  LogoActivity.language.equals("vi") )
            font = Typeface.MONOSPACE; //fix font in Nook book
        for (int i = 0; i < count; i++) {
            v = group.getChildAt(i);
            if (v instanceof TextView) {
                if(((TextView)v).getTypeface()!=null) {
                    if (((TextView) v).getTypeface().getStyle() == Typeface.BOLD) {
                        //do your stuff
                        ((TextView) v).setTypeface(font, Typeface.BOLD);
                    }
                    else
                    {
                        ((TextView) v).setTypeface(font);
                    }
                }
                else
                {
                    ((TextView) v).setTypeface(font);
                }
                ((TextView) v).setSelected(true);
            }
            else if (v instanceof EditText) {
                if(((EditText)v).getTypeface()!=null) {
                    if (((EditText) v).getTypeface().getStyle() == Typeface.BOLD) {
                        //do your stuff
                        ((EditText) v).setTypeface(font, Typeface.BOLD);
                    }
                    else
                    {
                        ((EditText) v).setTypeface(font);
                    }

                }
                else
                {
                    ((EditText) v).setTypeface(font);
                }
            }
            else if (v instanceof Button) {
                if(((Button)v).getTypeface()!=null) {
                    if (((Button) v).getTypeface().getStyle() == Typeface.BOLD) {
                        //do your stuff
                        ((Button) v).setTypeface(font, Typeface.BOLD);
                    }
                    else
                    {
                        ((Button) v).setTypeface(font);
                    }
                }
                else
                {
                    ((Button) v).setTypeface(font);
                }
                ((Button) v).setSelected(true);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
                    ((Button) v).setAllCaps(true);
                }
            }
            else if (v instanceof ViewGroup)
                setFont(context,(ViewGroup) v);
        }
