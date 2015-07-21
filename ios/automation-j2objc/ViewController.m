//
//  ViewController.m
//  automation-j2objc
//
//  Created by Arnaud Kervern on 20/07/15.
//  Copyright (c) 2015 Nuxeo sandbox. All rights reserved.
//

#import "ViewController.h"
#import <Document.h>

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
    NXMDocument* doc = [[NXMDocument alloc] initWithNSString:@"/default-domain"];
    NSLog(@"%@", [doc getId]);
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

@end
