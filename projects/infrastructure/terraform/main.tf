# provider config
terraform {
  cloud {
    organization = "rondon-sarnik"

    workspaces {
      name = "lkr-general-infrastructure"
    }
  }

  required_providers {
    cloudflare = {
      source  = "cloudflare/cloudflare"
      version = "~> 5.1.0"
    }
  }
}

variable "cloudflare_api_token" {
  default = ""
}

provider "cloudflare" {
  api_token = var.cloudflare_api_token
}