# ParallaxOnViewPager
A simple ViewPager with parallax effect



#Simple Usage



    private ViewPager myViewPager;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare XML views...
        myViewPager = (ViewPager) findViewById(R.id.myViewPager);

        myViewPager.setAdapter(new adapterViewPager(getSupportFragmentManager()));  //set ViewPager adapter

        /* Setting Effects...
         *  recommended set values from 2 (slow) to -2 (fast)
         * ParallaxTransformInformation arguments =>
         * <THE ID OF VIEW THAT WILL BE PARALLAXED>,
         * <THE SPEED WHEN VIEW ENTER ON SCREEN>,
         * <THE SPEED WHEN VIEW EXIT FROM SCREEN>
         */

        ParallaxPageTransformer pageTransformer = new ParallaxPageTransformer()
        .addViewToParallax(new ParallaxPageTransformer.ParallaxTransformInformation(R.id.imgIcon, 0.6f, 0.4f))
        .addViewToParallax(new ParallaxPageTransformer.ParallaxTransformInformation(R.id.llRedBlock, 0.8f, 0.6f))
        .addViewToParallax(new ParallaxPageTransformer.ParallaxTransformInformation(R.id.llBlueBlock, 1f, 0.8f))
        .addViewToParallax(new ParallaxPageTransformer.ParallaxTransformInformation(R.id.llGreenBlock, 1.5f, 1.0f));

        myViewPager.setPageTransformer(true, pageTransformer); //set page transformer
