    public void createPartControl(Composite parent) {<|del|>

       mParent = parent;
        mContents = null;

        mOpenTraceFileAction = new CommonAction("Open trace file") {
            @Override
            public void run() {
                FileDialog fd = new FileDialog(mParent.getShell(), SWT.OPEN);
                mFilename = fd.open();
                if (mFilename != null) {
                    display();
                }
            }
        };

        IActionBars actionBars = getViewSite().getActionBars();

        // toolbar
        IToolBarManager toolBarManager = actionBars.getToolBarManager();
        toolBarManager.add(mOpenTraceFileAction);
    }